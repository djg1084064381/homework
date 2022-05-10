public class PersonTest {
    public static void main(String[] args) {
        Person[] person=new Person[3];
        person[0]=new Person("李明",11,"java");
        person[1]=new Person("李刚",39,"java");
        person[2]=new Person("赵露思",19,"java");
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-i-j; j++) {
              if (person[j].getAge()>person[j+1].getAge()){
                Person person1 = person[j];
                person[j]=person[j+1];
                person[j+1]=person1;
            }

        }
    }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);


        }



}}
