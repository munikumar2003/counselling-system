<h1>Counselling System</h1>

<h2>📝 Overview</h2>
<p>
A web-based counselling management system built using Spring Boot, PostgreSQL, and a modern front-end.<br>
Designed to streamline scheduling, sessions, and tracking of counselling interactions for users and counsellors.
</p>

<h2>🎯 Features</h2>
<ul>
<li>User registration and login (students/clients & counsellors)</li>
<li>Role-based access control (Admin, Counsellor, Client)</li>
<li>Session booking and scheduling</li>
<li>Session notes and tracking</li>
<li>Dashboard for users and counsellors</li>
<li>Responsive UI</li>
<li>Docker supported deployment</li>
</ul>

<h2>🧰 Tech Stack</h2>
<ul>
<li><strong>Backend:</strong> Java, Spring Boot, Spring Security, JPA/Hibernate</li>
<li><strong>Database:</strong> PostgreSQL</li>
<li><strong>Frontend:</strong> HTML, CSS, JavaScript</li>
<li><strong>Build:</strong> Maven</li>
<li><strong>Deployment:</strong> Docker</li>
</ul>

<h2>🚀 Getting Started</h2>

<h3>Prerequisites</h3>
<ul>
<li>Java 17+</li>
<li>PostgreSQL</li>
<li>Docker (optional)</li>
</ul>

<h3>Setup Steps</h3>

<pre>
git clone https://github.com/munikumar2003/counselling-system.git
cd counselling-system
</pre>

<h4>Update <code>application.properties</code></h4>

<pre>
spring.datasource.url=jdbc:postgresql://localhost:5432/UsersDB
spring.datasource.username=postgres
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.security.user.name=
spring.security.user.password=
</pre>

<h4>Run using Maven</h4>
<pre>
mvn clean install
mvn spring-boot:run
</pre>

<h4>Run using Docker</h4>
<pre>
docker build -t counselling-system .
docker run -p 8080:8080 counselling-system
</pre>

<p><strong>Open:</strong> http://localhost:8080</p>

<h2>✅ Project Structure</h2>

<pre>
/src
 ├── main
 │    ├── java/com/...   controllers, services, models, repositories
 │    └── resources       templates, properties, static files
 ├── test                 tests
Dockerfile
pom.xml
.gitignore
README.md
</pre>

<h2>💡 Future Enhancements</h2>
<ul>
<li>Email/SMS notifications</li>
<li>Analytics dashboard</li>
<li>Video-counselling integration</li>
<li>Multi-tenant institution support</li>
<li>Mobile App / PWA</li>
</ul>

<h2>👤 Author</h2>
<p><strong>Muni Kumar Chemuru</strong><br>
M.Tech, NIT Srinagar<br>
Java Developer | Aspiring Software Engineer & Data Analyst
</p>

<p><em>Thank you for checking out this project! Feel free to contribute.</em></p>
