* 오라클 사용자 생성

create user book IDENTIFIED by 1234
default tablespace users
temporary tablespace temp;

grant connect, dba to book;

create SEQUENCE seq_board;

create table tbl_board(
    bno number(10, 0),
    title varchar2(200) not null,
    content varchar2(2000) not null,
    writer varchar2(20) not null,
    regdate date default sysdate,
    updatedate date default sysdate
);

alter table tbl_board add CONSTRAINT pk_board primary key(bno);

insert into tbl_board(bno, title, content, writer)
values(seq_board.nextval, 'java', '내용.....', '남궁성');

select * from tbl_board;

commit;