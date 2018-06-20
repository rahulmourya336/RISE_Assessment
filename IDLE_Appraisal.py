"""
        Python program for employee appraisal
        
        Experience >= 3 : 5% raise
        Experience < 3  : 3% raise
        On Female       : +2% raise
        
"""
import math

EXP_GRET_3 = 0.5
EXP_LESS_3 = 0.3
IS_FEMALE = 0.2

emp_salary =       []
emp_exp =          []
emp_gender =       []
dummy_emp_salary = []


def IncrementOnTenK(salary):
        return 0.15 if salary >= 10000 else 0.5

def appraisal(salary, exp, gender):
        temp = 0
        if gender == 'F':
                temp += 0.2
        if exp >= 3:
                temp += EXP_GRET_3
                temp += IncrementOnTenK(salary)
                salary += salary * temp
                print("[increment",round(temp),"]")
                return float(salary)
        else:
                temp += EXP_LESS_3
                temp += IncrementOnTenK(salary)
                salary += salary * temp
                print("increment",round(temp),"]")
                return float(salary)

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
