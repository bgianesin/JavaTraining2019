package javatraining.Inheritance;

class Faculties{	//base/super class
    float total_sal=0,salary=30000;
}

class HRA extends Faculties{	//Drived class & base class
    float hra=3000;
}

class DA extends HRA{		//Drived class & base class
    float da=2000;
}

public class MultilevelInheritances extends DA {    //Drived class
    float bonous=2000;
    public static void main(String[] args) {
        MultilevelInheritances objMultilevelInheritances=new MultilevelInheritances();
        System.out.println(objMultilevelInheritances.total_sal);

        objMultilevelInheritances.total_sal=objMultilevelInheritances.salary+objMultilevelInheritances.hra+objMultilevelInheritances.da+objMultilevelInheritances.bonous;

        System.out.println("Total Salary is:"+objMultilevelInheritances.total_sal);

    }
}

