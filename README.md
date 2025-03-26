# ProjectManagement

Project management

DATABASE DESIGN

    employee table - 
        1. id
        2. Emp id
        3. Emp name
        4. emp designation


    project table -
        1. id
        2. proj id
        3. proj name

    roles-

        1. id
        2. role id
        3. role name

    project mapping -

        1. id
        2. emp id
        3. proj id
        4. role id	

ENTITY:

    1. employee

        1. emp id
        2. emp name
        3. emp designation
    
    2. project

        1. proj id
        2. proj name
    
    3. roles

        1. role id
        2. role name

    4. project mapping

        1. emp id
        2. proj id
        3. role id

Output:

    0. Map employess to project

        a. display unmapped employees
        b. emp name id
        c. display project list
        d. enter project id
        e. display roles list
        f. enter role id
        g. map employee to project


    1. Display project mapping

        Emp name | Emp Designation | Project Name | Role

    2. Display unmapped employess

        Emp name | Emp Designation

    3. Display employess in a particular project

        Emp name | designation | role

    4.Number of employees in a particular project

    5. Unmap employee from project using emp id and proj id

