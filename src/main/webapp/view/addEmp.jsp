<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Employee Management System</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addEmp">Add Emp</a>
       
        </li>
       
      </ul>
      
    </div>
  </div>
</nav>
<div class="container">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<div class="card">
				<div class="card-header text-center">
					<h3>Add Employee</h3>
				</div>
				<div class="card-body">
					<form action="createEmp" method="post">
					<div class="mb-3">
						<label>Enter Full Name</label>
						<input type="text" name="fullName" class="form-control">
					</div>
					
					<div class="mb-3">
						<label>Enter Address</label>
						<input type="text" name="address" class="form-control">
					</div>
					
					<div class="mb-3">
						<label>Enter Email</label>
						<input type="email" name="email" class="form-control">
					</div>
					
					<div class="mb-3">
						<label>Enter Password</label>
						<input type="password" name="password" class="form-control">
					</div>
					
					<div class="mb-3">
						<label>Enter Designation</label>
						<input type="text" name="designation" class="form-control">
					</div>
					
					<div class="mb-3">
						<label>Enter Salary</label>
						<input type="text" name="salary" class="form-control">
					</div>
					
					<button class="btn btn-primary">Submit</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>