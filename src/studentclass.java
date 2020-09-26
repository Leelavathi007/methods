public class studentclass {
    int id;
    String n;


    studentclass(String name) {
        System.out.println("NAME:"+name);
    }
    studentclass(int id) {
        System.out.println("ID:" + id);
    }
    studentclass(){
        System.out.println("Unknown");
    }
    public static void main(String[] args){
        int name;
        studentclass s = new studentclass( "");
        studentclass s1 = new studentclass(s.id);

    }



}
