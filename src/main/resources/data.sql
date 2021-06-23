INSERT INTO employers (companyname, email, password, phone, verifiedbyemail, verifiedbysystemuser, weburl ) VALUES
  ('Tüpraş', 'hr@tupras.com', '1234', '031211122222', true, true, 'www.tupras.com'),
  ('Petkim', 'hr@petkim.com', '1234', '031211122222', true, true, 'www.petkim.com');
  
INSERT INTO jobtitles (title) VALUES
  ('Software Developer'),
  ('Software Architect');  
  
INSERT INTO jobseekers (firstname, lastname, nationalidentity, birthyear, email, password, verifiedbyemail ) VALUES
  ('Barbaros', 'Yurttagül', '15452194696', '1981', 'aaa@bbb.com', '1234', true),
  ('Ogeday', 'Yurttagül', '15452194697', '1982', 'bbb@bbb.com', '1234', true); 
  
INSERT INTO cities (name) VALUES ('Ankara'), ('İzmir'), ('İstanbul');  
  
INSERT INTO jobs (description, vacantposition, deadline, releasedate, minsalary, maxsalary, employer_id, jobtitle_id, city_id, valid) 
VALUES ('AAA', 2, NOW(), NOW(), 5000, 7500, 1, 1, 1, true),
	   ('açıklama', 4, '2021-06-03 18:54:07.184459', '2021-06-09 18:54:07.184459', 3500, 7500, 2, 2, 2, false),
	   ('Java bilmelidir', 6, '2021-06-05 18:54:07.184459', '2021-06-13 18:54:07.184459', 6500, 9500, 1, 2, 3, true);
	   
INSERT INTO jobseekereducations (school, startyear, endyear, fieldofstudy, jobseeker_id) 
VALUES ('Deniz Harp Okulu', 1999, 2003, 'Bilgisayar Müh.', 1),
       ('Beykent Üniversitesi', 2005, 2007, 'Yönetim ve Organizasyon', 1);
       
INSERT INTO jobseekerforeignlanguages (language, level, jobseeker_id)
VALUES ('English', 5, 1);

INSERT INTO jobseekerskills (skill, jobseeker_id)
VALUES ('C Sharp', 1),
	   ('Java', 2);
       
INSERT INTO socialaccounttypes (socialaccounttypename) 
VALUES ('Github'),
	   ('Linkedin');
	   
INSERT INTO jobseekersocialaccounts (socialaccounturl, jobseeker_id, socialaccounttype_id)
VALUES ('https://github.com/barbarosyurttagul', 1, 1),
	   ('https://linkedin.com/barbarosyurttagul', 1, 2);
	   
INSERT INTO curriculumvitaes (cvname, jobseeker_id) 
VALUES ('SOFTWARE', 1),
	   ('YAZILIM', 2);	   
	   



       

	   
	   
	   