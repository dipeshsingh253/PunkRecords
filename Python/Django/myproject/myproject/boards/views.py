from django.shortcuts import get_object_or_404, redirect, render
from django.contrib.auth.models import User
from .models import Board, Post, Topic
from .forms import NewTopicForm

# Create your views here.
def home(request):
    boards = Board.objects.all()
    return render(request, 'home.html', {'boards': boards})


def board_topics(request, pk):
    board = get_object_or_404(Board,pk=pk)
    return render(request, 'topics.html', {'board' : board})


def new_topic(request,pk):
    board = get_object_or_404(Board, pk=pk)
    user = User.objects.first()

    if request.method == 'POST':
        form = NewTopicForm(request.POST)
        if form.is_valid():
            topic = form.save(commit=False)
            print(topic.id)
            return redirect('board_topics', pk=pk)
    else:
        form = NewTopicForm()

    return render(request, 'new_topic.html', {'board':board, 'form':form})