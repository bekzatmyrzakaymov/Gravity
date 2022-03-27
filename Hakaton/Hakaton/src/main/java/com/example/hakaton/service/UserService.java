package com.example.hakaton.service;

import com.example.hakaton.entity.StudentEntity;
import com.example.hakaton.entity.TeachEntity;
import com.example.hakaton.model.User;
import com.example.hakaton.repo.StudentRepository;
import com.example.hakaton.repo.TeachRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    final StudentRepository studentRepository;
    final TeachRepository teachRepository;

    public Boolean check_user(User user){
        if(user.getType().equals("teach")){
            if(teachRepository.existsTeachEntityByEmail(user.getEmail()))
                return teachRepository.getTeachEntityByEmail(user.getEmail()).getPassword().equals(user.getPassword());
        }else{
            if(studentRepository.existsStudentEntityByEmail(user.getEmail()))
                return studentRepository.getStudentEntityByEmail(user.getEmail()).getPassword().equals(user.getPassword());
        }
        return false;
    }

    public Boolean create_teach(TeachEntity teach){
        if(teach.getEmail().length()<3
                || teach.getPassword().length()<3
                || teach.getName().length()<2
                || teach.getSurname().length()<2){
            return false;
        }
        else {
            teachRepository.save(teach);
            return true;
        }
    }
    public Boolean create_student(StudentEntity student){
        if(student.getEmail().length()<3
                || student.getPassword().length()<3
                || student.getName().length()<2
                || student.getSurname().length()<2){
            return false;
        }
        else {
            studentRepository.save(student);
            return true;
        }
    }

    public StudentEntity getStudent(Long id){
        return studentRepository.getStudentEntityById(id);
    }
    public TeachEntity getTeach(Long id){
        return teachRepository.getTeachEntityById(id);
    }

}
