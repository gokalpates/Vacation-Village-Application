create or replace procedure addIndActivity(actName varchar(35), actLink varchar(255), actDate date, 
										   actHour time, animatorID int, actAge integer)
	language sql as $$
	insert into activity(name, link, date, hour, animatorID) values(actName, actLink, actDate, actHour, animatorID);
	
	with lastID as (
		select activityID
		from activity
		order by activityID
		limit 1
	)
	
	insert into individualActivity values((select * from lastID), actAge);
	$$;
	
create or replace procedure addMassAct(actName varchar(35), actLink varchar(255),actDate date, 
									   actHour time, animatorID int, actType varchar(35), actCap varchar(10))
	language sql as $$
	insert into activity(name, link, date, hour, animatorID) values(actName, actLink, actDate, actHour, animatorID);
	
	with lastID as (
		select activityID
		from activity
		order by activityID
		limit 1
	)
	
	insert into massActivity values((select * from lastID), actType, actCap);
	$$;