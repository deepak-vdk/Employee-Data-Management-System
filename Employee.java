import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String [] args){

        ArrayList<Data> Datalist = new ArrayList<>();

        Scanner Iscanner =  new Scanner(System.in);
        Scanner Sscanner =  new Scanner(System.in);
        Scanner Dscanner =  new Scanner(System.in);

        int Option;
        do {
            System.out.println("Enter Your Option");

            System.out.println("1.Create");
            System.out.println("2.Insert");
            System.out.println("3.Read");
            System.out.println("4.Search");
            System.out.println("5.Update");
            System.out.println("6.Delete");
            System.out.println("0.Exit");

            System.out.println("-----------------------");

            System.out.print("Enter Your Option:  ");
            Option = Iscanner.nextInt();

            switch (Option){
                case 0:
                    System.out.println("-----------------------");

                    System.out.println("You Selected 0.Exit");
                    System.out.println("Thanks For Using");

                    System.out.println("-----------------------");
                    break;
                case 1:
                    System.out.println("You Selected 1.Create");
                    System.out.println("-----------------------");
                    System.out.print("How Many Records You Are Going To Add:   ");
                    int Count = Iscanner.nextInt();

                    for(int i = 0;i<Count;i++){
                        System.out.print("Enter Employee Number:   ");
                        int Eno = Iscanner.nextInt();

                        System.out.print("Enter Employee Name:   ");
                        String Name = Sscanner.nextLine();

                        System.out.print("Enter Employee Salary:   ");
                        Double Sal = Dscanner.nextDouble();

                        Data Obj1 = new Data(Eno,Name,Sal);
                        Datalist.add(Obj1);
                        System.out.println("-----------------------");
                    }
                    break;

                case 2:
                    System.out.println("YOu Selected 2.Insert");
                    System.out.println("-----------------------");

                    System.out.print("How Many Records You Are Going To Insert:   ");
                    int Count1 = Iscanner.nextInt();
                    int k=0;

                    while (Count1>k){

                        System.out.print("Enter Employee Number:   ");
                        int Eno = Iscanner.nextInt();

                        System.out.print("Enter Employee Name:   ");
                        String Name = Sscanner.nextLine();

                        System.out.print("Enter Employee Salary:   ");
                        Double Sal = Dscanner.nextDouble();

                        Data Obj = new Data(Eno,Name,Sal);
                        Datalist.add(Obj);

                        k++;
                    }

                    System.out.println("-----------------------");
                    break;

                case 3:
                    System.out.println("You Selected 3.Read");
                    System.out.println("-----------------------");

                    for (Data i : Datalist){
                        System.out.println(i);
                    }
                    System.out.println("-----------------------");
                    break;
                case 4:
                    Boolean value1 = true;

                    System.out.println("You Selected 4.Search");
                    System.out.println("-----------------------");
                    System.out.print("Enter Employee Number to Search:   ");
                    int SearchEno = Iscanner.nextInt();
                    System.out.println();

                    for (Data i:Datalist){
                        if ( SearchEno == i.getEno()){
                            System.out.println("Searched Element Is Founded");
                            System.out.println(i);
                            value1 = false;
                        }
                    }
                    if (value1){
                        System.out.println("Searched Element Is Not Founded");
                        break;
                    }
                    System.out.println("-----------------------");
                    break;
                case 5:
                    boolean value2 = true;
                    System.out.println("You Selected 5.Update");
                    System.out.println("-----------------------");

                    System.out.print("Enter The Employee Number To Update Salary:   ");
                    int ToUpdate = Iscanner.nextInt();

                    System.out.print("Enter The New Salary:   ");
                    double NewSal = Iscanner.nextDouble();

                    for(Data i:Datalist) {
                        if (ToUpdate == i.getEno()) {
                            i.setSal(NewSal);
                            value2 = false;
                            System.out.println("Records Are Updated");

                            for (Data j:Datalist){
                                System.out.println(j);
                            }
                        }
                    }
                    if (value2) {
                        System.out.println("Check The Given Data Record Does'nt Exist");
                        System.out.println("Records Not Updated ");
                    }
                    break;
                case 6:
                    System.out.println("You Selected 6.Delete");
                    System.out.println("-----------------------");

                    System.out.println("Press 5 to Delete The Record...");
                    System.out.println("Press 7 to Delete All The Records...");
                    System.out.println();
                    System.out.print("Your Option:   ");

                    int Delete = Iscanner.nextInt();

                    if (Delete == 7){
                        Datalist.clear();
                        System.out.println("Your All Records Are Deleted Successfully ");
                    }

                    if (Delete == 5){
                        System.out.print("How Many Records You Are Going To Delete:   ");
                        int Num =Iscanner.nextInt();
                        boolean value3 = true;
                        int init = 0;

                        while (init <Num){
                            System.out.print("Enter The Employee Number To Be Removed:   ");
                            int ToDelete =Iscanner.nextInt();

                            for (Data i:Datalist){
                                if(ToDelete == i.getEno()){
                                    Datalist.remove(i);
                                    value3 = false;
                                }
                            }
                            if(value3){
                                System.out.println("Check The Given Data Record Does'nt Exist");
                                System.out.println("Records Not Removed ");
                            }
                            ++init;
                        }
                        break;
                        }
            }
        }while (Option>0);
    }
}