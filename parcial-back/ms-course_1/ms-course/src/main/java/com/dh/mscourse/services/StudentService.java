package com.dh.mscourse.services;

import com.dh.mscourse.models.Student;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Service
public class StudentService {

    private final RestTemplate clienteRest;

    public StudentService(RestTemplate clienteRest) {
        this.clienteRest = clienteRest;
    }


    public List<Student> findAll(){
        var url = "http://localhost:8086/students/findAll";
        var response = clienteRest.exchange(url, HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Student>>() {
                });

        return Objects.requireNonNull(response.getBody());
    }

}
