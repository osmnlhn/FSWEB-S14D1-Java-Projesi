package Company;

public class MidDeveloper extends Employee {

    public MidDeveloper (int id,String name){
        super(id,name);

    }

    @Override
    public void work(){
        setSalary(Salaries.MD.getSalary());
        System.out.println(getName() + "Mid developer starts to working...");
    }
}
