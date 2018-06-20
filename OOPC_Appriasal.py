"""
        Python program for employee appraisal
        
        Experience >= 3 : 5% raise
        Experience < 3  : 3% raise
        On Female       : +2% raise
        
"""

class Employee:
    EXP_GRET_3 = 0.5
    EXP_LESS_3 = 0.3
    IS_FEMALE = 0.2

    def IncrementOnTenK(salary):
        return 0.15 if salary >= 10000 else 0.5

    def appraisal(salary, exp, gender):
        temp = 0
        if gender == 'F':
                temp += 0.2
        if exp >= 3:
                temp += EXP_GRET_3 + IncrementOnTenK(salary)
                salary += salary * temp
                print("[increment",temp,"]")
                return float(salary)
        else:
                temp += self.EXP_LESS_3 + IncrementOnTenK(salary)
                salary += salary * temp
                print("[increment",temp,"]")
                return float(salary)


emp_count = int(input("Total Employees: "))
object_ = Employee()
object_list = []
initial_salary_sum = 0

for emp in range(0, emp_count):
        #Add Salary, Experience and Gender to list
	emp_salary = (int(input("\nSalary: ")))
	emp_exp = (int(input("Experience: ")))
	emp_gender = (input("Gender: "))
	object_list.append(Employee(emp_salary, emp_exp, emp_gender))

for loop in range(0, len(object_)):
    initial_salary_sum += object_[loop].salary


print("\n\nBefore Appraisal CTC:", )

for emp in range(0, emp_count):
        dummy_emp_salary.append(appraisal(emp_salary[emp], emp_exp[emp], emp_gender[emp]))

print(dummy_emp_salary)
print("After Appraisal CTC: ", sum(map(int, dummy_emp_salary)))


