<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register User</title>
</head>
<body>
<h1>Let's find HackBuddies!</h1>
<form action="/register" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="studyLevel">Study Level:</label>
    <select id="studyLevel" name="studyLevel">
        <option value=" "> </option>
        <option value="HIGH_SCHOOL">High School</option>
        <option value="COLLEGE">College</option>
        <option value="UNIVERSITY">University</option>
        <option value="GRADUATE">Graduate</option>
        <option value="OTHERS">Others</option>
    </select><br><br>

    <label for="studyYear">Study Year:</label>
    <input type="number" id="studyYear" name="studyYear" required min="0" max="5"><br><br>

    <input type="submit" value="Start">
</form>
</body>
</html>
