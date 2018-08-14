def call(Map config) {
	node {
    echo "Repo: https://github.com/${config.name}/${config.project}.git"
	}
}

