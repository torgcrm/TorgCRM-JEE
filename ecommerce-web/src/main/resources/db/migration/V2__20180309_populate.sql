insert into projects(id, title, code, host, description)
VALUES (seq_projects.nextval, 'Project', 'prj', 'domain.ru', 'domain.ru');

insert into menu(id, name, code, project_id)
VALUE (seq_menu.nextval, 'Top header menu', 'top', 1)

insert into menu(id, name, code, project_id)
VALUE (seq_menu.nextval, 'Left menu', 'left', 1)

