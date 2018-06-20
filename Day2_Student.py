#Day 2: Student and info

class Stduent:
    Name = []
    Gender = []
    CPI = []
    Height = []

    def __init__(self, name, gender, cpi, height):
        self.Name.append(name)
        self.Gender.append(gender)
        self.CPI.append(cpi)
        self.Height.append(height)

    def getAverage(self):
        average = sum(self.CPI)
        return average / len(self.CPI)

    def maxByGender(gender, cpi):
        scoreByGender = []
        tempMale= []
        tempFemale = []
        for loop in range(0, len(gender)):
            if gender[loop] == "F" or g:
                tempFemale.append(gender.index(gender))
            else:
                tempMale.append(gender.index(gender))
        

name_ = []
gender_ = []
cpi_ = []
height_ = []

NumberOfStudents = int(input("How many students: "))
for loop in range(0, NumberOfStudents):
    name_.append(input("Enter student name: "))
    gender_.append(input("gender: " ))
    cpi_.append(float(input("CPI: " )))
    height_.append(float(input("height: ")))    

    object_ = Stduent(name_, gender_, cpi_, height_)

print("Average of CPI: ", object_.getAverage())





