<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class=" content container ">
    <section id="registration">
        <div class="page-header">
            <h1>Register for a new account</h1>
        </div>
        <form id="registration-form" class="form-horizontal" action="" method="post">
            <div class="form-group">
                <label for="name" class="col-xs-12 col-sm-2 control-label">Name</label>
                <div class="col-xs-12 col-sm-8">
                    <input type="text" class="form-control" id="name" name="name" placeholder="Your name">
                </div>

            </div>
            <div class="form-group">
                <label for="surname" class="col-xs-12 col-sm-2 control-label">Surname</label>
                <div class="col-xs-12 col-sm-8">
                    <input type="text" class="form-control" id="surname" name="surname" placeholder="Your surname">
                </div>

            </div>
            <div class="form-group">
                <label for="username" class="col-xs-12 col-sm-2 control-label">Username</label>
                <div class="col-xs-12 col-sm-8">
                    <input type="text" class="form-control" id="username" name="username" placeholder="Your username">
                </div>

            </div>
            <div class="form-group">
                <label for="email" class="col-xs-12 col-sm-2 control-label">Email</label>
                <div class="col-xs-12 col-sm-8">
                    <input type="text" class="form-control" id="email" name="email" placeholder="Your email">
                </div>

            </div>
            <div class="form-group">
                <label for="password" class="col-xs-12 col-sm-2 control-label">Password</label>
                <div class="col-xs-12 col-sm-8">
                    <input type="text" class="form-control" id="password" name="password" placeholder="Your password">
                </div>

            </div>

            <div class="form-group">
              <label class="col-xs-12 col-sm-2 control-label">Select your role</label>
                <div class="col-xs-12 col-sm-8" data-toggle="buttons">
                    <label class="btn btn-primary active">
                        <input type="radio" name="role" id="role-customer" value="customer" autocomplete="off" checked> Customer
                    </label>
                    <label class="btn btn-primary">
                        <input type="radio" name="role" id="role-organizer" value="organizer" autocomplete="off"> Organizer
                    </label>
                </div>
            </div>
            <div class="form-group">
                <div class="col-xs-12 col-sm-8 col-sm-offset-2">
                    <button type="submit" class="btn btn-success btn-block" name="submit"><span class="glyphicon glyphicon-lock"></span> Sign up</button>
                </div>
            </div>
        </form>
    </section>
</div>
