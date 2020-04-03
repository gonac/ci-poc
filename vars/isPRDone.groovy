/**
 * setPRLabel() calls the GitHub API to assign a label to the pull request that was built in this job.
 * It removes Labels that it might have previously set
 * Requires a valid GitHub personal access token with admin privileges for this repository in the environment variable GITHUB_OAUTH_TOKEN
 */
def call(def org, def repo) {
    def parts = pkg.split('/')
    apiURL = "https://api.github.com/repos/${org}/${repo}/issues/${env.CHANGE_ID}/labels"


    def output = sh (returnStdout: true, script: "curl -H \"Authorization: token ${env.GITHUB_OAUTH_TOKEN}\"  ${apiURL}")

}
