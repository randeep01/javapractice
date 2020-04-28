class Student{
    int age;
    String name;
    boolean sex;
}
public class ISortCom{
    static void sort(Student[] arr)
    {
        int n = arr.length;
        for(int i =1;i<n;++i){
            Student key = arr[i];
            int j = i -1;

            while(j>=0 && (arr[j].age> key.age || arr[j].name.charAt(0)>key.name.charAt(0) || arr[j].sex)){
                arr[j+1] = arr[j];
                j= j-1;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        Student a = new Student();
        a.age = 10;
        a.name = "abc";
        a.sex = true;

        Student b = new Student();
        b.age = 10;
        b.name= "abc";
        b.sex = false;

        Student c = new Student();
        c.age = 11;
        c.name= "cde";
        c.sex = true;

        Student d = new Student();
        d.age = 11;
        d.name= "def";
       d.sex = true;

        Student[] arr = new Student[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
    
        sort(arr);

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i].name + " " + arr[i]. age + " " + arr[i].sex);
        }


    }
}

