# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table activity (
  activity_id                   integer auto_increment not null,
  activity_name                 varchar(255),
  discription                   varchar(255),
  removed_date                  datetime(6),
  constraint pk_activity primary key (activity_id)
);

create table activity_department (
  activity_activity_id          integer not null,
  department_department_id      integer not null,
  constraint pk_activity_department primary key (activity_activity_id,department_department_id)
);

create table attend (
  activity_id                   integer not null,
  student_id                    varchar(255) not null,
  attend_date                   date,
  activityid                    integer,
  studentid                     varchar(255),
  constraint pk_attend primary key (activity_id,student_id)
);

create table belongto (
  student_id                    varchar(255) not null,
  department_id                 integer not null,
  contact_number                varchar(255),
  other_info                    varchar(255),
  priviledge                    varchar(255),
  studentid                     varchar(255),
  departmentid                  integer,
  constraint pk_belongto primary key (student_id,department_id)
);

create table community (
  community_id                  integer auto_increment not null,
  community_name                varchar(255),
  description                   longtext,
  constraint pk_community primary key (community_id)
);

create table department (
  department_id                 integer auto_increment not null,
  department_name               varchar(255),
  communityid                   integer,
  constraint pk_department primary key (department_id)
);

create table event (
  activity_id                   integer not null,
  event_order                   integer not null,
  description                   longtext,
  end_date                      date,
  start_date                    date,
  activityid                    integer,
  constraint pk_event primary key (activity_id,event_order)
);

create table message (
  text_id                       integer auto_increment not null,
  content                       longtext,
  departmentid                  integer,
  constraint pk_message primary key (text_id)
);

create table student (
  studentid                     varchar(255) not null,
  grade                         integer,
  major                         varchar(255),
  password                      varchar(255),
  sex                           integer CHECK(sex = 1 or sex = 0),
  last_login_date               datetime(6),
  student_name                  varchar(255),
  constraint pk_student primary key (studentid)
);

alter table activity_department add constraint fk_activity_department_activity foreign key (activity_activity_id) references activity (activity_id) on delete restrict on update restrict;
create index ix_activity_department_activity on activity_department (activity_activity_id);

alter table activity_department add constraint fk_activity_department_department foreign key (department_department_id) references department (department_id) on delete restrict on update restrict;
create index ix_activity_department_department on activity_department (department_department_id);

alter table attend add constraint fk_attend_activityid foreign key (activityid) references activity (activity_id) on delete restrict on update restrict;
create index ix_attend_activityid on attend (activityid);

alter table attend add constraint fk_attend_studentid foreign key (studentid) references student (studentid) on delete restrict on update restrict;
create index ix_attend_studentid on attend (studentid);

alter table belongto add constraint fk_belongto_studentid foreign key (studentid) references student (studentid) on delete restrict on update restrict;
create index ix_belongto_studentid on belongto (studentid);

alter table belongto add constraint fk_belongto_departmentid foreign key (departmentid) references department (department_id) on delete restrict on update restrict;
create index ix_belongto_departmentid on belongto (departmentid);

alter table department add constraint fk_department_communityid foreign key (communityid) references community (community_id) on delete restrict on update restrict;
create index ix_department_communityid on department (communityid);

alter table event add constraint fk_event_activityid foreign key (activityid) references activity (activity_id) on delete restrict on update restrict;
create index ix_event_activityid on event (activityid);

alter table message add constraint fk_message_departmentid foreign key (departmentid) references department (department_id) on delete restrict on update restrict;
create index ix_message_departmentid on message (departmentid);


# --- !Downs

alter table activity_department drop foreign key fk_activity_department_activity;
drop index ix_activity_department_activity on activity_department;

alter table activity_department drop foreign key fk_activity_department_department;
drop index ix_activity_department_department on activity_department;

alter table attend drop foreign key fk_attend_activityid;
drop index ix_attend_activityid on attend;

alter table attend drop foreign key fk_attend_studentid;
drop index ix_attend_studentid on attend;

alter table belongto drop foreign key fk_belongto_studentid;
drop index ix_belongto_studentid on belongto;

alter table belongto drop foreign key fk_belongto_departmentid;
drop index ix_belongto_departmentid on belongto;

alter table department drop foreign key fk_department_communityid;
drop index ix_department_communityid on department;

alter table event drop foreign key fk_event_activityid;
drop index ix_event_activityid on event;

alter table message drop foreign key fk_message_departmentid;
drop index ix_message_departmentid on message;

drop table if exists activity;

drop table if exists activity_department;

drop table if exists attend;

drop table if exists belongto;

drop table if exists community;

drop table if exists department;

drop table if exists event;

drop table if exists message;

drop table if exists student;

