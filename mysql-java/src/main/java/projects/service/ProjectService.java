package projects.service;

import projects.dao.ProjectsDao;
import projects.entity.Project;

public class ProjectService {
	private ProjectsDao projectsDao = new ProjectsDao();
	
	public Project addProject(Project project) {
		return projectsDao.insertProject(project);
	}
}
