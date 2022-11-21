package pl.sdacademy.java.patterns;

import java.util.Set;

class Teacher implements HasPerson {
   private Person person;

   private Set<String> subjectCodes;

   public static TeacherBuilder builder(){return new TeacherBuilder();}

   public Teacher(Person person, Set<String> subjectCodes) {
      this.person = person;
      this.subjectCodes = subjectCodes;
   }

   @Override
   public Person getPerson() {
      return person;
   }

   public Set<String> getSubjectCodes() {
      return subjectCodes;
   }
}
