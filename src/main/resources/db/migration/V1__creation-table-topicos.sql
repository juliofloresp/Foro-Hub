create table topicos(

                        id bigint not null auto_increment,
                        titulo varchar(100) not null,
                        mensaje varchar(100) not null,
                        fechaCreacion varchar(100) not null,
                        status varchar(100) not null,

                    primary key(id)
);