package com.example.final_jsp_servlet.servlet;

import com.example.final_jsp_servlet.entity.Employee;
import com.example.final_jsp_servlet.repo.EmployeeRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet( name = "employeeServlet", value = "/employeeServlet")
public class EmployeeServlet extends HttpServlet {
    EmployeeRepo repo = new EmployeeRepo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> adminList = repo.getAll();
        req.setAttribute("employeeList", adminList);
        req.getRequestDispatcher("employeeList.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String fullName = req.getParameter("fullName");
            String birthDay = req.getParameter("birthDay");
            String address = req.getParameter("address");
            String position = req.getParameter("position");
            String department = req.getParameter("department");
            Employee employee = new Employee(fullName, birthDay, address, position, department);
            repo.insertEmployee(employee);
            List<Employee> listUser = repo.getAll();
            req.setAttribute("employeeList", listUser);
            req.getRequestDispatcher("employeeList.jsp").forward(req,resp);
        } catch (Exception ex){
            log(ex.getMessage());
        }
    }
}
