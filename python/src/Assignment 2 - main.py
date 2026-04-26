import datetime

def date2string(date, type):
    if type == "short" or type == "s":
        dname = date.strftime("%a, %B %d, %Y")
    elif type == "long" or type == "l":
        dname = date.strftime("%A, %B %d, %Y")
    else: 
        raise ValueError("Not a Valid response") 
    return dname

if __name__ == '__main__':
    choice = input("Please enter your preferred date format (s)hort/(l)ong:")
    print(date2string(datetime.datetime.now(), choice))
