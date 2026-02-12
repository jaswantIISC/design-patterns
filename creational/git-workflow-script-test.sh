export GITHUB_REPOSITORY= nlci/backend-team/

test_cases=(
  "#139: fix bug"
  "nlci/backend-team#139: fix bug"
  "https://github.com/nlci/backend-team/issues/139: fix bug"
)

for msg in "${test_cases[@]}"; do
  echo "INPUT: $msg"

  echo "$msg" | sed -E '
    s|^https://github.com/([^/]+/[^/]+)/issues/([0-9]+).*|\1#\2|;
    s|^([a-zA-Z0-9_.-]+/[a-zA-Z0-9_.-]+#[0-9]+).*|\1|;
    s|^#([0-9]+).*|'"$GITHUB_REPOSITORY"'#\1|;
  '
  echo "-----"
done
