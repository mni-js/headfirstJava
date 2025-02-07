public class DoctorTestDrive {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        System.out.println("Doctor: " + doctor.worksAtHospital);
        doctor.treatPatient();

        FamilyDoctor familyDoctor = new FamilyDoctor();
        System.out.println("FamilyDoctor: " + familyDoctor.worksAtHospital);
        System.out.println("FamilyDoctor: " + familyDoctor.makesHouseCalls);
        familyDoctor.treatPatient();
        familyDoctor.giveAdvice();

        Surgeon surgeon = new Surgeon();
        System.out.println("Surgeon: " + surgeon.worksAtHospital);
        surgeon.treatPatient();
        surgeon.makeIncision();
    }
}