package com.inshot.inshotTest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inshot.inshotTest.dto.Response;
import com.inshot.inshotTest.mapper.Employeemapper;
import com.inshot.inshotTest.model.Employes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/employee")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class Employeecontroller {

    Response<Object> res = new Response<>();
    ArrayList<String> msg = new ArrayList<>();
    @Autowired
    private Employeemapper employeemapper;

    @GetMapping("/getall")
    public List<Employes>getAllemployes(){
        return employeemapper.getAllemployee();
    }
    @PostMapping("/insert")
    public Response<Object> InsetEmployee(@RequestBody Employes employes) {
        
        // String email = employes.getEmail();
        // String name = employes.getName();
        // String phone = employes.getPhone();
        // String position = employes.getPosition();

        // if(email.isEmpty()){
        //    res.setStatus(HttpStatus.BAD_REQUEST.toString());
        //    res.getMessage().add("email can't null");
        //    res.setPayload(null);
        // }
        // else if(name.isEmpty()){
        //     res.setStatus(HttpStatus.BAD_REQUEST.toString());
        //     res.getMessage().add("name can't null");
        //     res.setPayload(null);
        //  }
        // else if(phone.isEmpty()){
        //     res.setStatus(HttpStatus.BAD_REQUEST.toString());
        //     res.getMessage().add("phone can't null");
        //     res.setPayload(null);
        //  }
        // else if(position.isEmpty()){
        //     res.setStatus(HttpStatus.BAD_REQUEST.toString());
        //     res.getMessage().add("position can't null");
        //     res.setPayload(null);
        //  }

        // else{
        employeemapper.insertEmployee(employes);
        res.setStatus(HttpStatus.OK.toString());
        res.getMessage().add("Success");
        res.setPayload(employes);
        // }

        return res;

    }

    @PutMapping("/update")
    public Response<Object> updateEmployee(@RequestBody Employes employes) {
        String email = employes.getEmail();
        String name = employes.getName();
        String phone = employes.getPhone();
        String position = employes.getPosition();

        if(email.isEmpty()){
           res.setStatus(HttpStatus.BAD_REQUEST.toString());
           res.getMessage().add("email can't null");
           res.setPayload(null);
        }
        else if(name.isEmpty()){
            res.setStatus(HttpStatus.BAD_REQUEST.toString());
            res.getMessage().add("name can't null");
            res.setPayload(null);
         }
        else if(phone.isEmpty()){
            res.setStatus(HttpStatus.BAD_REQUEST.toString());
            res.getMessage().add("phone can't null");
            res.setPayload(null);
         }
        else if(position.isEmpty()){
            res.setStatus(HttpStatus.BAD_REQUEST.toString());
            res.getMessage().add("position can't null");
            res.setPayload(null);
         }
         else{
            employeemapper.updateEmployee(employes);
            res.setStatus(HttpStatus.OK.toString());
            res.getMessage().add("Success");
            res.setPayload(employes);
         }
         return res;
        
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
        try {
            employeemapper.deleteEmployeeById(id);
            return ResponseEntity.ok("Employee deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error deleting employee: " + e.getMessage());
        }
    }
    
}
