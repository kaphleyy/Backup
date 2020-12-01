from tkinter import *


root = Tk()

root.title("QuizKing")
root.geometry("600x800")
root.config( background ="#ffffff")

img1 = PhotoImage(file = "2.png")
labelimage = Label(root,image= img1 , background = "#ffffff")
labelimage.pack(pady=(40,4))

labelText = Label(root, text="QuizKing", font=("fira code",24,"bold"), background="#ffffff")
labelText.pack()
root.mainloop()