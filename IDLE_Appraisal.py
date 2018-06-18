#10 emp
# exp >=3 

def appraisal(salary, exp, gender):
	if exp >= 3:
		return salary * 0.5
	elif  exp < 3:
		return salary * 0.3
	elif gender == "F" or gender == "f":
		return salary * 0.2
	else:
		pass

emp_salary = []
emp_exp = []
emp_gender = []

for i in range(0, 10):
	emp_salary[i] = int(input("Salary"))
	emp_exp[i] = int(input("experience"))
	emp_gender[i] = input("Gender")

initial_salary_sum = sum(emp_salary)
print(initial_salary_sum)

