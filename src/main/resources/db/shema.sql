create table movie_rate(

  id int not null auto_increment,
  grade int not null,
  user_count int not null,
  primary key (id)
);


create table cast_member(

  id int not null auto_increment,
  name varchar(255) not null,
  primary key (id)
);

create table movie(

  id int not null auto_increment,
  title varchar(255) not null,
  cover_image clob not null,
  description varchar(255) not null,
  release_date date not null,
  tv_show boolean default false,
  movie_rate_id int,
  primary key (id)
);

alter table movie
    add foreign key (movie_rate_id)
    references movie_rate (id);

create table cast(

  id int not null auto_increment,
  cast_member_id int not null,
  movie_id int not null,
  primary key (id)
);

 alter table cast
    add foreign key (movie_id)
    references movie (id);

 alter table cast
    add foreign key (cast_member_id)
    references cast_member (id);