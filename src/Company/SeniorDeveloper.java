package Company;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper (int id,String name){
        super(id,name);
    }

    public void work(){
        setSalary(Salaries.SN.getSalary());
        System.out.println(getName() + "Senior developer starts to working...");

    }
}
