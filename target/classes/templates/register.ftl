<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register User</title>
    <link rel="stylesheet" type="text/css" href="/style.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Work+Sans:wght@400;700&display=swap">

</head>
<body style="margin:0">
<div class="register-box">
    <section id="register-logo" >
        <img src="/HACKBuddies.png" alt="HACKBuddies">
    </section>
<h1 class="register-title">Let's find HackBuddies!</h1>
    <div class="register-form">
<form action="/register" method="post">
    <div class="register-formbox">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

        <div class="register-forminput">
    <label for="studyLevel" style="flex-shrink: 0">Study Level:</label>
    <select id="studyLevel" name="studyLevel">
        <option value=" "> </option>
        <option value="HIGH_SCHOOL">High School</option>
        <option value="COLLEGE">College</option>
        <option value="UNIVERSITY">University</option>
        <option value="GRADUATE">Graduate</option>
        <option value="OTHERS">Others</option>
    </select><br><br>
        </div>
        <div class="register-forminput">
            <label for="studyYear" style="flex-shrink: 0">Study Year:</label>
            <input type="number" id="studyYear" name="studyYear" required min="0" max="5"><br><br>
        </div>

    </div>
    <input class="register-submitbtn" type="submit" value="Start">
</form>
    </div>
</div>
</body>
</html>
