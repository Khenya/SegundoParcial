package examen2.E2;

public class Client {
    public static void main(String[] args) {
        ChatComunicacion chatComunicacion = new ChatComunicacion();
    Estudiante estudiante1 = new Estudiante(chatComunicacion, 46, "ber");
    
    Estudiante estudiante5 = new Estudiante(chatComunicacion, 4656, "ber");
    Estudiante estudiante2 = new Estudiante(chatComunicacion, 467, "ber");
    Estudiante estudiante3 = new Estudiante(chatComunicacion, 456, "ber");
    Estudiante estudiante4 = new Estudiante(chatComunicacion, 4, "ber");

    Administrativo admin_1 = new Administrativo(chatComunicacion,"Cx",145,"Secretaria");
    
        Administrativo admin_2 = new Administrativo(chatComunicacion,"s",15,"Administador");
        //3.
        Administrativo admin_3 = new Administrativo(chatComunicacion," j",117,"Secretaria General");

        //Docente
        //1.
        Docentes teacher_1 =  new Docentes(chatComunicacion, "Dani", 54);
        //2.
        Docentes teacher_2 =  new Docentes(chatComunicacion, "Rs", 45);
        //3.
        Docentes teacher_3 =  new Docentes(chatComunicacion, "Mela", 373);
        chatComunicacion.addPeopleToList(estudiante1);
        chatComunicacion.addPeopleToList(estudiante2);chatComunicacion.addPeopleToList(estudiante3);chatComunicacion.addPeopleToList(estudiante4);chatComunicacion.addPeopleToList(estudiante5);

        chatComunicacion.addPeopleToList(admin_1);
        chatComunicacion.addPeopleToList(admin_2);
        chatComunicacion.addPeopleToList(admin_3);

        chatComunicacion.addPeopleToList(teacher_3);
        chatComunicacion.addPeopleToList(teacher_2);
        chatComunicacion.addPeopleToList(teacher_1);
        estudiante1.send("hb");
        
        
    }
    

}
