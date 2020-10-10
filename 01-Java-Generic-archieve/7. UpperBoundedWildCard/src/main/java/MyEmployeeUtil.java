public class MyEmployeeUtil<T extends Emp> {
    private T emp;

    public MyEmployeeUtil(T emp) {
        this.emp = emp;
    }

    public int getSalary(){
        return emp.getSalary();
    }

    public boolean isSalaryEqual(MyEmployeeUtil<? extends Emp> otherEmp){

        if(emp.getSalary() == otherEmp.getSalary()){
            return true;
        }
        return false;
    }
}
