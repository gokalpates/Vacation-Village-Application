--test customer password generation
insert into customer values('123456789', 'test', 43, 2,'5071132150');

--test animator password generation
insert into animator values('234567899','test2', '5071132150','test area');

--test delete activity trigger 
insert into activity values('111111111','test activity','testactivity.com','2022-04-23','18:00:00');
insert into individualActivity values('111111111',24);
insert into massActivity values('111111111','type test',20);
insert into emergencyInformation values('111111111','5071132150','36');

--test add activity procedures
call addIndActivity('888888888', 'IndTest', 'testtest.test', '2022-03-23','15:00:00',35);
call addMassAct('555555555', 'massTest', 'test-test.test', '2022-03-13','20:00:00','supra', 31);