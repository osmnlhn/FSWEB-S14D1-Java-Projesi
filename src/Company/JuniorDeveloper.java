package Company;

public class JuniorDeveloper extends Employee {

   public JuniorDeveloper(int id ,String name){
       super(id,name);
    }

    @Override
    public void work(){
       setSalary(Salaries.HR.getSalary());
       System.out.println(getName()+"Mid developer starts to working...");
    }
}
