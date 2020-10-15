/*
 7.ვაქვს Teacher ცხრილი, რომელსაც აქვს შემდეგი მახასიათებლები: 
 სახელი, გვარი, სქესი, საგანი. 
 გვაქვს Pupil ცხრილი, რომელსაც აქვს შემდეგი მახასიათებლები: 
 სახელი, გვარი, სქესი, კლასი. 
 ააგეთ ნებისმიერ რელაციურ ბაზაში ისეთი დამოკიდებულება, რომელიც საშუალებას მოგვცემს 
 მასწავლებელმა ასწავლოს რამოდენიმე მოსწავლეს, და ამავდროულად მოსწავლეს ყავდეს რამოდენიმე 
 მასწავლებელი (როგორც რეალურ ცხოვრებაში).
 1.დაწერეთ sql რომელიც ააგებს შესაბამის table-ებს.
 2. დაწერეთ sql რომელიც დააბრუნებს ყველა მასწავლებლებს, 
 რომელიც ასწავლის მოსწავლეს, რომელის სახელია: „გიორგი“ .
*/

CREATE TABLE Pupil(
studentID INT primary key NOT NULL auto_increment,
FName VARCHAR(20),
LName VARCHAR(20),
Sex VARCHAR(10),
classID INT,
primary key(studentID),
FOREIGN KEY (classID) REFERENCES Class(classID)
);

CREATE TABLE Teacher(
teacherID INT primary key NOT NULL auto_increment,
FName VARCHAR(20),
LName VARCHAR(20),
Sex VARCHAR(10),
subjectID INT, 
foreign key(subjectID) references Subjects(subjectID)
);
create table Subjects(
subjectID INT primary key NOT NULL auto_increment,
subName VARCHAR(25),
classID INT ,
foreign key(classID) references Class(classID)
);
create table Class(
classID INT NOT NULL auto_increment,
className VARCHAR(25),
PRIMARY KEY(classID)
);
INSERT into Pupil(fname, lname, sex, classID)
values('Mariam', 'Chikovani', 'male', 1);
INSERT into Pupil(fname, lname, sex, classID)
values('Katsura', 'Kotarou', 'male', 2);

INSERT into Teacher(fname, lname, sex, subjectID)
values('Gintoki', 'Sakata', 'female', 1);
INSERT into Teacher(fname, lname, sex, subjectID)
values('Jugem', 'Jugem', 'male', 2);

INSERT into Subjects(subName)
values('life');
INSERT into Subjects(subName)
values('Sports');

INSERT into Class(className) values('5a');
INSERT into Class(className) values('5b');

Select Teacher.fname 
from Subjects 
join Teacher on Subjects.subjectID = Teacher.subjectID 
join Pupil on Subjects.classID = Pupil.classID
WHERE Pupil.fname = 'Giorgi';
