* 오라클 사용자 생성
create user book IDENTIFIED by 1234
default tablespace users
temporary tablespace temp;

grant connect, dba to book;