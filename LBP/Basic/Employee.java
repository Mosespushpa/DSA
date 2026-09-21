public class Employee {
    protected int id;
    protected String name;
    protected double salary;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    
    public static void main(String ar[]){
        Employee emp = new Employee();
        Input in = new Input();
        System.out.print("Enter id: ");
        int id = in.sc.nextInt();
        System.out.print("Enter name: ");
        String  name = in.sc.next();
        System.out.print("Enter Salary: ");
        double salary = in.sc.nextDouble();

        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);

        System.out.println(emp.getId()+"\n"+emp.getName()+"\n"+emp.getSalary());

        
    }
}
