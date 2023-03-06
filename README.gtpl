<p align="center"><a href="https://github.com/KenichiQaz/Github-readme-stats">
  <img align="center" src="https://github-readme-stats-jade-ten.vercel.app/api?username=KenichiQaz&show_icons=true&theme=tokyonight&count_private=true" />
</a></p>


### 👷 What I'm currently working on
{{ range recentContributions 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🌱 My latest projects
{{ range recentRepos 5 }}
- [{{ .Name }}]({{ .URL }}) - {{ .Description }}
{{- end }}

### ⭐ Recent Stars
{{ range recentStars 5 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}
