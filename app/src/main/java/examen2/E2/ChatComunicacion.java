package examen2.E2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ChatComunicacion implements ICanalComunicacion {
    private Map<Integer, Member> per = new HashMap<>();
    private List<Integer> list = new ArrayList<>();
    int key;

    public void addPeopleToList(Member member){
        if(member instanceof Estudiante){
            Estudiante student = (Estudiante)member;
            key = student.getNumreoMatricula();
            list.add(key);
            addPeopleToMap(key, member);
        }else if (member instanceof Docentes){
            Docentes teacher = (Docentes)member;
            key = teacher.getCi();
            list.add(key);
            addPeopleToMap(key, member);
        }else if (member instanceof Administrativo){
            Administrativo student = (Administrativo) member;
            key = student.getAdmin_id();
            list.add(key);
            addPeopleToMap(key, member);
        }
    }

    public void addPeopleToMap(int id_persona, Member persona){
        per.put(id_persona,persona);
    }

    @Override
    public void send(String message, Member member) {
        Member personaParseOrigen = member;
        for (int people : list){
            if (personaParseOrigen instanceof Administrativo) {
                Administrativo administrativo = (Administrativo)personaParseOrigen;
                if(people != administrativo.getAdmin_id()){
                    per.get(people).messageReceived(message);
                }
            } else if (personaParseOrigen instanceof Docentes && (per.get(people) instanceof Docentes || per.get(people) instanceof Estudiante)) {
                Docentes docentes = (Docentes)personaParseOrigen;
                if(people != docentes.getCi()){
                    per.get(people).messageReceived(message);
                }
            } else if (personaParseOrigen instanceof Estudiante && (per.get(people) instanceof Docentes      || per.get(people) instanceof Administrativo)){
                Estudiante estudiante = (Estudiante) personaParseOrigen;
                if(people != estudiante.getNumreoMatricula()){
                    per.get(people).messageReceived(message);
                } else if(people != estudiante.getNumreoMatricula() && per.get(people) instanceof Administrativo){
                    per.get(people).messageReceived(message);
                } else  if(people != estudiante.getNumreoMatricula()  && per.get(people) instanceof Docentes){
                    per.get(people).messageReceived(message);
                }
            }
        }
    }
}
