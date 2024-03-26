import urllib.request

def standard_inout_example():
    name = input("Enter your name: ")
    age_str  = input("Enter your age: ")
    age = int(age_str)
    print(f"Hello, {name}!, You are {age} old...") # here f provides formating.


def reading_remote_file(url):
    try:
        response = urllib.request.urlopen(url)
        data = response.read().decode("utf-8")
        print(data)
    except Exception as e:
        print(f"An erro occured {e} while fetching the data")




standard_inout_example()
url = "https://raw.githubusercontent.com/dipeshsingh253/PunkRecords/main/README.md"
reading_remote_file(url)