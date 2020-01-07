<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
        <style>
            table , th , td{
                border: 1px solid red;
            }
        </style>
    </head>
    <body>
    <%
    String correct[] = {"A","B","C"};
    String name = (String) session.getAttribute("candidate");
    String ans1 = (String) session.getAttribute("ans1");
    String ans2 = (String) session.getAttribute("ans2");
    String ans3 = (String) session.getAttribute("ans3");   
    
    %>
    <%! 
    
    public int verify(String correct , String ans){
    	if(correct.equals(ans))
    		return 10;
    	return 0;
    }
    %>
    
    <% 
 	 int  marks =  verify(correct[0] , ans1) + verify(correct[1] , ans2) + verify(correct[2] , ans3) ;
    %>
    
        <h3>Result of <%= name %></h3>
    
        <table>
            <tr>
                <th>QN</th>
                <th>Correct Ans</th>
                <th>Your Ans</th>
                <th>Marks</th>
            </tr>
            <tr>
                <td>1</td>
                <td>A</td>
                <td><%=ans1 %></td>
                <td><%= verify(correct[0] , ans1) %></td>
                
            </tr>
            <tr>
                <td>2</td>
                <td>B</td>
                <td><%=ans2 %></td>
                <td><%= verify(correct[1] , ans2) %></td>
                
            </tr>
            <tr>
                <td>3</td>
                <td>C</td>
                <td><%=ans3 %></td>
                <td><%= verify(correct[2] , ans3) %></td>
            </tr>
            
            <tr>
            	<td></td>
                <td></td>
                <td>Total</td>
                <td><%= marks%></td>
            </tr>
    
        </table>
        
        
        
        <a href="Name.html"> Retry ? </a>
    </body>
    </html>