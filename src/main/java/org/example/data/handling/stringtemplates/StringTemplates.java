package org.example.data.handling.stringtemplates;

public class StringTemplates {
    public void main(){
        String sqlQuery = """
                        SELECT
                            employees.id,
                            employees.name,
                            employees.role,
                            departments.name AS department_name,
                            projects.project_name,
                            projects.start_date,
                            projects.end_date
                        FROM
                            employees
                        INNER JOIN
                            departments ON employees.department_id = departments.id
                        LEFT JOIN
                            employee_projects ON employees.id = employee_projects.employee_id
                        LEFT JOIN
                            projects ON employee_projects.project_id = projects.id
                        WHERE
                            departments.name = ? AND
                            projects.start_date >= ? AND
                            projects.end_date <= ?
                        ORDER BY
                            employees.id ASC, projects.start_date DESC
                        """;
        //Use prepared statements and connection to the database
        System.out.println(sqlQuery);
        System.out.println("*********************************");

        String departmentName = "Engineering";
        String startDate = "2021-01-01";
        String endDate = "2021-12-31";

        String sqlQueryWithStringConcatenation = "SELECT "
                + "employees.id, "
                + "employees.name, "
                + "employees.role, "
                + "departments.name AS department_name, "
                + "projects.project_name, "
                + "projects.start_date, "
                + "projects.end_date "
                + "FROM employees "
                + "INNER JOIN departments ON employees.department_id = departments.id "
                + "LEFT JOIN employee_projects ON employees.id = employee_projects.employee_id "
                + "LEFT JOIN projects ON employee_projects.project_id = projects.id "
                + "WHERE departments.name = '" + departmentName + "' "
                + "AND projects.start_date >= '" + startDate + "' "
                + "AND projects.end_date <= '" + endDate + "' "
                + "ORDER BY employees.id ASC, projects.start_date DESC";

        System.out.println("*****************************");
        System.out.println(sqlQueryWithStringConcatenation);
        System.out.println("*****************************");
        String sqlQueryWithString = """
                        SELECT
                            employees.id,
                            employees.name,
                            employees.role,
                            departments.name AS department_name,
                            projects.project_name,
                            projects.start_date,
                            projects.end_date
                        FROM
                            employees
                        INNER JOIN
                            departments ON employees.department_id = departments.id
                        LEFT JOIN
                            employee_projects ON employees.id = employee_projects.employee_id
                        LEFT JOIN
                            projects ON employee_projects.project_id = projects.id
                        WHERE
                            departments.name = '%s' AND
                            projects.start_date >= '%s' AND
                            projects.end_date <= '%s'
                        ORDER BY
                            employees.id ASC, projects.start_date DESC
    """.formatted(departmentName, startDate, endDate);
        System.out.println("*****************************");
        System.out.println(sqlQueryWithString);
        System.out.println("*****************************");
        String sqlQueryWithStringTemplates = STR."""
                        SELECT
                            employees.id,
                            employees.name,
                            employees.role,
                            departments.name AS department_name,
                            projects.project_name,
                            projects.start_date,
                            projects.end_date
                        FROM
                            employees
                        INNER JOIN
                            departments ON employees.department_id = departments.id
                        LEFT JOIN
                            employee_projects ON employees.id = employee_projects.employee_id
                        LEFT JOIN
                            projects ON employee_projects.project_id = projects.id
                        WHERE
                            departments.name = '\{departmentName}' AND
                            projects.start_date >= '\{startDate}' AND
                            projects.end_date <= '\{endDate}'
                        ORDER BY
                            employees.id ASC, projects.start_date DESC
                        """;
        System.out.println(sqlQueryWithStringTemplates);

    }


}
