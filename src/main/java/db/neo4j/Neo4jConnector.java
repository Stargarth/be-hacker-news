package db.neo4j;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;

public class Neo4jConnector {
	private String userName = "neo4j";
	private String password = "qwerty";
	//private String url = "bolt://127.0.0.1:7687";
	private String url = "bolt://178.62.100.149:1234";

	private Driver neo4jDataSource = null;

	public Neo4jConnector() {
		neo4jDataSource = GraphDatabase.driver(url, AuthTokens.basic(userName, password));
	}

	public Session getSession() {

		return neo4jDataSource.session();
	}
	
	public String getUrl() {
		return url;
	}
}
