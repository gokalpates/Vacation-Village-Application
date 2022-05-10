create or replace function delActivity() returns trigger as $$
	begin
		insert into activityHistory select * from emergencyInformation eInf where old.activityID = eInf.activityID;
		delete from emergencyInformation eInf where old.activityID = eInf.activityID;
		return old;
	end;
	$$ language plpgsql;
	 

create or replace trigger deleteActivity
	before delete on activity
	for each row
	execute function delActivity();