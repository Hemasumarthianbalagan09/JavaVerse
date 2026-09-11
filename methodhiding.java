class parent{
    static void print(){
        System.out.println("This is parent class");
    }
 }
    class child extends parent{
        static void childprint(){
            System.out.println("This is child class");
        }
     }
        public class methodhiding{
            public static void main(String[] args) {
                parent obj = new child();
                child obj1 = new child();
                obj.print();
                obj1.childprint();
            }
        }

