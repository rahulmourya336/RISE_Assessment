EXP_GRET_3 = 0.5
EXP_LESS_3 = 0.3
IS_FEMALE = 0.2

emp_salary =       []
emp_exp =          []
emp_gender =       []
dummy_emp_salary = []

def IncrementOnFemale(flag, salary):
        if (flag):
                return (salary * IS_FEMALE)

def appraisal(salary, exp, gender):
        temp = 0
        if gender == 'F':
                temp = IncrementOnFemale(1, salary)
        if exp >= 3:
                temp += salary * EXP_GRET_3
                return int(salary + temp)
        if exp < 3:
                temp += salary * EXP_LESS_3
                return int(salary + temp)

emp_count = int(input("Total Employees: "))

for emp in range(0, emp_count):
        #Add Salary, Experience and Gender to list
	emp_salary.append(int(input("\nSalary: ")))
	emp_exp.append(int(input("experience: ")))
	emp_gender.append(input("Gender: "))

initial_salary_sum = sum(emp_salary)
print("\n\nBefore Appraisal CTC:", initial_salary_sum)

for emp in range(0, emp_count):
        dummy_emp_salary.append(appraisal(emp_salary[emp], emp_exp[emp], emp_gender[emp]))

print(dummy_emp_salary)
print("After Appraisal CTC: ", sum(map(int, dummy_emp_salary)))
