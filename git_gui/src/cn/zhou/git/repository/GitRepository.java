package cn.zhou.git.repository;

import java.io.IOException;

import org.eclipse.jgit.attributes.AttributesNodeProvider;
import org.eclipse.jgit.lib.BaseRepositoryBuilder;
import org.eclipse.jgit.lib.ObjectDatabase;
import org.eclipse.jgit.lib.RefDatabase;
import org.eclipse.jgit.lib.ReflogReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.StoredConfig;

public class GitRepository extends Repository {

	public GitRepository() {
		super(new BaseRepositoryBuilder());
		System.out.println("no argument constructor...");
	}

	protected GitRepository(BaseRepositoryBuilder options) {
		super(options);

	}

	@Override
	public void create(boolean arg0) throws IOException {

	}

	@Override
	public AttributesNodeProvider createAttributesNodeProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StoredConfig getConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjectDatabase getObjectDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RefDatabase getRefDatabase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReflogReader getReflogReader(String arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void notifyIndexChanged(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void scanForRepoChanges() throws IOException {
		// TODO Auto-generated method stub

	}

}
