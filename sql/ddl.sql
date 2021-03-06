drop table if exists board CASCADE;
create table board
(
    id bigint generated by default as identity,
    title varchar(255),
    subtitle varchar(255),
    create_time date,
    comment bigint,
    creator varchar(255),
    like_num bigint
);
