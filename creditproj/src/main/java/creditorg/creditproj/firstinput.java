package creditorg.creditproj;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class firstinput implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label("gender")
   private java.lang.String gender;

   @org.kie.api.definition.type.Label("isdoctor")
   private Boolean isdoctor;

   @org.kie.api.definition.type.Label("salary")
   private java.lang.Integer salary;

   @org.kie.api.definition.type.Label("creditlimit")
   private java.lang.Integer creditlimit;

   @org.kie.api.definition.type.Label("salaryok")
   private java.lang.Boolean salaryok;

   @org.kie.api.definition.type.Label(value = "cardtype")
   private java.lang.String cardtype;

   public firstinput()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getGender()
   {
      return this.gender;
   }

   public void setGender(java.lang.String gender)
   {
      this.gender = gender;
   }

   public java.lang.Boolean getIsdoctor()
   {
      return this.isdoctor;
   }

   public void setIsdoctor(java.lang.Boolean isdoctor)
   {
      this.isdoctor = isdoctor;
   }

   public java.lang.Integer getSalary()
   {
      return this.salary;
   }

   public void setSalary(java.lang.Integer salary)
   {
      this.salary = salary;
   }

   public java.lang.Integer getCreditlimit()
   {
      return this.creditlimit;
   }

   public void setCreditlimit(java.lang.Integer creditlimit)
   {
      this.creditlimit = creditlimit;
   }

   public java.lang.Boolean getSalaryok()
   {
      return this.salaryok;
   }

   public void setSalaryok(java.lang.Boolean salaryok)
   {
      this.salaryok = salaryok;
   }

   public java.lang.String getCardtype()
   {
      return this.cardtype;
   }

   public void setCardtype(java.lang.String cardtype)
   {
      this.cardtype = cardtype;
   }

   public firstinput(java.lang.String name, java.lang.String gender,
         java.lang.Boolean isdoctor, java.lang.Integer salary,
         java.lang.Integer creditlimit, java.lang.Boolean salaryok,
         java.lang.String cardtype)
   {
      this.name = name;
      this.gender = gender;
      this.isdoctor = isdoctor;
      this.salary = salary;
      this.creditlimit = creditlimit;
      this.salaryok = salaryok;
      this.cardtype = cardtype;
   }

}